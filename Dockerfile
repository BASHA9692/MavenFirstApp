FROM tomact:latest


COPY /home/ec2-user/docker/workspace/docker_pipeline/target/*.jar  /tomcat/webapps/
