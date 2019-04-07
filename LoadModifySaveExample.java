/**
 ********************************************************************************
 * Copyright (c) 2018 Robert Bosch GmbH.
 * 
 * This program and the accompanying materials are made
 * available under the terms of the Eclipse Public License 2.0
 * which is available at https://www.eclipse.org/legal/epl-2.0/
 * 
 * SPDX-License-Identifier: EPL-2.0
 * 
 * Contributors:
 *     Robert Bosch GmbH - initial API and implementation
 ********************************************************************************
 */

package app4mc.example.tool.java;

import java.io.File;
import org.apache.commons.lang3.StringUtils;

import org.eclipse.app4mc.amalthea.model.Amalthea;
import org.eclipse.app4mc.amalthea.model.AmaltheaFactory;
import org.eclipse.app4mc.amalthea.model.Tag;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaLoader;
import org.eclipse.app4mc.amalthea.model.io.AmaltheaWriter;
import org.eclipse.app4mc.amalthea.model.util.ModelUtil;

import com.google.common.base.CharMatcher;
import com.google.common.base.Splitter;

public class LoadModifySaveExample {
	
	public static void nameNumberSplit(String delim, String details, String type)
	{
		String name = "Name";
		String number= "Number";
		int total = 0;
		
		Splitter nNSplitter = Splitter.on(delim).omitEmptyStrings().trimResults(CharMatcher.anyOf("[]")); //Creates guava splitter to tokenize string based on a delimiter while also removing leading and trailing '[]'s  
		System.out.println(type + ':');
		Iterable<String> task = nNSplitter.split(details);//returns iterable string and uses nNSplitter to split the results getOrCreate method thats been converted to a string
		System.out.printf("%-10s\t%-30s\n", number, name);
		System.out.printf("***************************\n");
		for(String token: task){
			name = StringUtils.substringAfter(token, "name:"); //gets the substring after name:
			name = StringUtils.substringBefore(name, ")").trim();//gets just the name of the task/runnable etc.
			number = StringUtils.substringBefore(token, "(").trim();//gets just the number following "org.eclipse.app4mc.amalthea.model.impl.TYPEImpl@"
			total++;
		    System.out.printf("%-10s\t%-30s\n", number, name); //Prints the name and number of the task/runnable on its own line in a standardized field for readability
		}
		System.out.printf("(Total Number of %s: %d)\n", type, total);
	}

	public static void main(String[] args) {

		// example: absolute path
		// final File inputFile = new File("d:/temp/democar.amxmi");
		// final File outputFile = new File("d:/temp/democar_1.amxmi");

		// example: relative path
		final File inputFile = new File("model-input/democar.amxmi");
		final File outputFile = new File("model-output/LoadModifySave/democar_1.amxmi");

		// ***** Load *****

		Amalthea model = AmaltheaLoader.loadFromFile(inputFile);

		if (model == null) {
			System.out.println("Error: No model loaded!");
			return;
		}
	
		// ***** Modify *****

		final AmaltheaFactory fac = AmaltheaFactory.eINSTANCE;

		Tag tag = fac.createTag();
		tag.setName("The new tag!");
		ModelUtil.getOrCreateCommonElements(model).getTags().add(tag);

		// ***** Save *****

		AmaltheaWriter.writeToFile(model, outputFile);
		
		//*****Software Model*****
		System.out.println();
		nameNumberSplit("org.eclipse.app4mc.amalthea.model.impl.TagImpl@", ModelUtil.getOrCreateCommonElements(model).getTags().toString(), "Tags"); //perform nameNumberSplit on software type tags to ensure tag was actually modified
		System.out.println();
		nameNumberSplit("org.eclipse.app4mc.amalthea.model.impl.TaskImpl@", ModelUtil.getOrCreateSwModel(model).getTasks().toString(), "Tasks");//perform nameNumberSplit on software type tasks
		System.out.println();
		nameNumberSplit("org.eclipse.app4mc.amalthea.model.impl.RunnableImpl@", ModelUtil.getOrCreateSwModel(model).getRunnables().toString(), "Runnables");//perform nameNumberSplit on software type runnables
		System.out.println();
		nameNumberSplit("org.eclipse.app4mc.amalthea.model.impl.LabelImpl@", ModelUtil.getOrCreateSwModel(model).getLabels().toString(), "Labels");//perform nameNumberSplit on software type labels
		//*****Hardware Model*****
		System.out.println();
		nameNumberSplit("org.eclipse.app4mc.amalthea.model.impl.ProcessingUnitDefinitionImpl@", ModelUtil.getOrCreateHwModel(model).getDefinitions().toString(), "Processors");//perform nameNumberSplit on hardware type processor
	}

}
