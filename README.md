# LoadModifySaveExample
Modification of LoadModifySave example in app4mc for GSoC.

This example uses org.apache.commons.lang3.StringUtils, so if it's not already there the jar should be added to the buildpath which can be found here: http://commons.apache.org/proper/commons-lang/download_lang.cgi


The full workspace can be seen in the workspace foolder, or just the modified java file can be found by itself. Output for the example should look like this:

Reading file: file:/Users/cornelius/Desktop/Eclipse.app/Contents/MacOS/workspace/app4mc.example.tool.java/model-input/democar.amxmi
Writing file: file:/Users/cornelius/Desktop/Eclipse.app/Contents/MacOS/workspace/app4mc.example.tool.java/model-output/LoadModifySave/democar_1.amxmi

Tags:\n
Number    	Name                          
***************************
1ec9bd38  	SwcEngineController           
452e19ca  	SwcActuators                  
6b0d80ed  	SwcBrakeForceArbiter          
6f8e8894  	SwcABSCalculation             
3cfdd820  	SwcSensors                    
928763c   	SwcSensorPostprocessing       
e25951c   	SwcCylNumObserver             
15f47664  	SwcBrakeForceCalculation      
471a9022  	SwcEngineSensors              
dc9876b   	SwcInjIgnActuation            
2f666ebb  	The new tag!                  
(Total Number of Tags: 11)

Tasks:
Number    	Name                          
***************************
102cec62  	Task_10MS                     
3e44f2a5  	Task_20MS                     
651aed93  	Task_5MS                      
(Total Number of Tasks: 3)

Runnables:
Number    	Name                          
***************************
12299890  	ABSCalculation                
6a57ae10  	APedSensor                    
544d57e   	APedVoter                     
29a5f4e7  	BaseFuelMass                  
1e4d3ce5  	BrakeActuator                 
1bab8268  	BrakeActuatorMonitor          
389c4eb1  	BrakeForceActuation           
135606db  	BrakeForceArbiter             
68f1b17f  	BrakeForceCalculation         
2a225dd7  	BrakePedalSensorDiagnosis     
7ef27d7f  	BrakePedalSensorTranslation   
b83a9be   	BrakePedalSensorVoter         
30c8681   	BrakeSafetyMonitor            
2931522b  	CaliperPositionCalculation    
6aa61224  	CheckPlausability             
68f4865   	CylNumObserver                
b978d10   	DecelerationSensorDiagnosis   
1672fe87  	DecelerationSensorTranslation 
6ee4d9ab  	DecelerationSensorVoter       
9573584   	DiagnosisArbiter              
352c1b98  	EcuBrakeActuator              
68d279ec  	EcuBrakePedalSensor           
4f6f416f  	EcuDecelerationSensor         
44c73c26  	EcuStopLightActuator          
41294f8   	EcuVehicleSpeedSensor         
68dc098b  	EcuWheelSpeedSensor           
3148f668  	IgnitionTimeActuation         
4ddbbdf8  	IgnitionTiming                
3af0a9da  	InjectionTimeActuation        
38604b81  	MassAirFlowSensor             
69f1a286  	StopLightActuator             
71e9ebae  	ThrottleActuator              
35645047  	ThrottleController            
4671115f  	ThrottleSensor                
be68757   	TotalFuelMass                 
3bd323e9  	TransientFuelMass             
327bcebd  	VehicleSpeedSensorDiagnosis   
6239aba6  	VehicleSpeedSensorTranslation 
30c93896  	VehicleSpeedSensorVoter       
70f02c32  	VehicleStateMonitor           
5c44c582  	WheelSpeedSensorDiagnosis     
15713d56  	WheelSpeedSensorTranslation   
27216cd   	WheelSpeedSensorVoter         
(Total Number of Runnables: 43)

Labels:
Number    	Name                          
***************************
35432107  	ABSActivation                 
7a1a14a4  	ABSMode                       
a3d9978   	APedPosition1                 
4b41dd5c  	APedPosition2                 
5d066c7d  	APedSensor1Voltage            
5ba88be8  	APedSensor2Voltage            
3899782c  	ArbitratedBrakeForce          
9ebe38b   	ArbitratedDiagnosisRequest    
38089a5a  	BaseFuelMassPerStroke         
66c92293  	BrakeApplication              
4f0100a7  	BrakeForce                    
13ad5cd3  	BrakeForceCurrent             
5bf0fe62  	BrakeForceFeedback            
673be18f  	BrakeForceVoltage             
39de3d36  	BrakeMonitorLevel             
54e7df6a  	BrakePedalPosition            
77128536  	BrakePedalPosition1           
32c4e8b2  	BrakePedalPosition2           
764faa6   	BrakePedalPositionVoltage1    
598bd2ba  	BrakePedalPositionVoltage2    
7ae42ce3  	BrakeSafetyLevel              
484094a5  	BrakeSafetyState              
63fbfaeb  	CalculatedBrakeForce          
2c07545f  	CaliperPosition               
32c726ee  	CylinderNumber                
34c01041  	DecelerationRate1             
c94fd30   	DecelerationRate2             
2c4d1ac   	DecelerationVoltage1          
545b995e  	DecelerationVoltage2          
524f3b3a  	DesiredThrottlePosition       
49ff7d8c  	DesiredThrottlePositionVoltage
2ef14fe   	IgnitionTime                  
45312be2  	IgnitionTime1                 
58be6e8   	IgnitionTime2                 
3f9342d4  	IgnitionTime3                 
50d13246  	IgnitionTime4                 
e70f13a   	IgnitionTime5                 
64a40280  	IgnitionTime6                 
42b02722  	IgnitionTime7                 
49964d75  	IgnitionTime8                 
466276d8  	InjectionTime1                
27eedb64  	InjectionTime2                
31c7528f  	InjectionTime3                
7a1234bf  	InjectionTime4                
24ba9639  	InjectionTime5                
53f6fd09  	InjectionTime6                
1b84f475  	InjectionTime7                
13330ac6  	InjectionTime8                
39a2bb97  	MAFRate                       
8c3619e   	MAFSensorVoltage              
6f63b475  	MassAirFlow                   
1608bcbd  	MonitoredVehicleState         
29ca3d04  	ThrottlePosition              
5812f68b  	ThrottleSensor1Voltage        
3c7c886c  	ThrottleSensor2Voltage        
1a20270e  	TotalFuelMassPerStroke        
336f1079  	TransientFuelMassPerStroke    
34158c08  	TriggeredCylinderNumber       
52c3cb31  	VehicleSpeed1                 
53941c2f  	VehicleSpeed2                 
21fd5faa  	VehicleSpeedVoltage1          
5460cf3a  	VehicleSpeedVoltage2          
2e6a5539  	VotedAPedPosition             
6d025197  	VotedBrakePedalPosition       
7e4204e2  	VotedDecelerationRate         
740d2e78  	VotedVehicleSpeed             
72437d8d  	VotedWheelSpeed               
676cf48   	WheelSpeed1                   
335b5620  	WheelSpeed2                   
32a68f4f  	WheelSpeedVoltage1            
6eb2384f  	WheelSpeedVoltage2            
(Total Number of Labels: 71)

Processors:
Number    	Name                          
***************************
6f3c660a  	DefaultCore                   
(Total Number of Processors: 1)
