# JENKINS
Jenkins is a open source CI/CD tool for automated build, test and deploy across different environment.

## CI - Continuous Integration
CI is a development practice that enforce developers to synchronize code into a shared repository. Each and every check in that developer do will pass through various stages like build, test, package before the code is ready for deployment. This will detect problems earlier and notify the developers for fix.

## CD -  Continuous Delivery
CD ensures software product is delivered over a short cycle reliably.

## List of terminologies frequently used
### Master
A central process which is responsible for instruct nodes to execute task, manage plugins and configurations. 
### Agent
An agent is typically a machine, or container, which connects to a Jenkins master and executes tasks when directed by the master.
### Node
Node is a machine in jenkins environment capable of executing pipeline/projects. 
### Executor
It is nothing but the slot which is needed to execute task defined by node/pipeline/project.
### Workspace
A disposable directory on the file system of a Node where work can be done by a Pipeline or Project. Workspaces are typically left in place after a Build or Pipeline run completes unless specific Workspace cleanup policies have been put in place on the Jenkins Master.
### Stage
Stage is a block with distinct subset of tasks to be performed.
### Step
A single task.
### Script
Script block is enclosed in steps block and it has list of scripts to be executed in a declarative pipeline. 
### Pipeline
Pipeline is an automated series of process for getting the software from version control to users. Process could be build, test, security findings, package, publish and deploy. `Jenkinsfile` contains the various stages of the pipeline.

## Jenkins Integration
Below were the prominent services that can be integrated with jenkins.
1. Email Integration
2. Slack Integration
3. Github Integration
4. Bitwise Integration
5. JFrog Integration
6. Sonarqube Integration

## GEMS in Jenkins
### Organization Folder
This feature in jenkins will get rid of onboarding new job for a new application. It will scan as per schedule configuration and detect and onboard application on to jenkins if it finds some new repositories.
### CRON Scheduling
Jenkins uses cron expression and lets you to schedule jobs to execute over a period of time.

````
Example Project - jenkins-pipeline-spring-boot-app

Illustrate jenkins pipeline job to build, test, publish and deploy sample spring boot application.
````
![Screenshot from 2019-09-07 16-38-03](https://user-images.githubusercontent.com/36845597/64474134-f1de9180-d18d-11e9-985b-b428a6ecfcbf.png)
