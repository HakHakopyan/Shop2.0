call mvn -B -s settings.xml -DskipTests=true clean install
call java -Dspring.profiles.active="datajpa,heroku" -DDATABASE_URL="postgres://postgres:password@localhost:5432/topjava" -jar target/dependency/webapp-runner.jar --port $PORT target/*.war