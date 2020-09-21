FROM tomcat:8.0

ADD ./webapp/target/*.war /usr/local/tomcat/webapps/

EXPOSE 9999

CMD ["catalina.sh","run"]
