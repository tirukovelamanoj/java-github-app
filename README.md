<p align="center"><img src="https://github.com/ManojCSE17/java-github-app/workflows/Main%20CI/badge.svg?branch=master&event=push" alt="CI" /></p>

# Simple Java Web Application

## Languages
<b>
Java,<br>
JSP,<br>
HTML
</b>

<br>

## Project built using maven 

<b>clean</b><br/>

```cmd
 mvn clean -f "jwa/pom.xml"
```

<b>compile</b><br>

```cmd
mvn compile -f "jwa/pom.xml"
```

<b>test</b><br>

```cmd
mvn test -f "jwa/pom.xml"
```

<b>install</b><br>

```cmd
mvn install -f "jwa/pom.xml"
```

<br>

## Packaging
<b>WAR</b>

<br>

## Deployed to Heroku
### Secrets to configure for deployment
<br>

| Name | Required | Description |
|------|----------|------------|
| `HEROKU_API_KEY` | true |  This will be used for authentication. You can find it in your heroku homepage account settings |
| `HEROKU_APP_NAME` | true |The app name to use for deploying |
| `HEROKU_EMAIL` | true | Email that you have registered with heroku |

### Note: Only <b>WAR</b> file is deployed to heroku