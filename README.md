# 2018年8月テスト

## Google Sheets API
src/main/java/test/no1s/googleSheetsApi/Main.javaを実行してください。  
APIキーを引数で渡す必要があります。  

### Maven
・Mavenインストール手順  
ダウンロード：https://maven.apache.org/download.cgi  
  
ダウンロードしたzipファイルを解凍、binパスを環境変数Pathに追加  
「C:\apache-maven-3.5.3\bin」  
  
インストール確認  
コマンドプロンプトで「mvn -version」  
↓  
C:\Users\yong>mvn -version  
Apache Maven 3.5.3 (3383c37e1f9e9b3bc3df5050c29c8aff9f295297; 2018-02-25T04:49:05+09:00)  
Maven home: C:\apache-maven-3.5.3\bin\..  
Java version: 1.8.0_111, vendor: Oracle Corporation  
Java home: C:\Program Files\Java\jdk1.8.0_111\jre  
Default locale: ja_JP, platform encoding: MS932  
OS name: "windows 10", version: "10.0", arch: "amd64", family: "windows"  
  
・Eclipse設定  
プラグインインストール  
Eclipse Marketplaceで「m2e」を検索、プラグインをインストールする  
  
Mavenプロジェクトを作成  
  
・pom.xml
```xml:pom.xml
 <dependencies>
    <dependency>
      <groupId>com.google.apis</groupId>
      <artifactId>google-api-services-sheets</artifactId>
      <version>v4-rev536-1.24.1</version>
    </dependency>
	<dependency>
	  <groupId>com.fasterxml.jackson.core</groupId>
	  <artifactId>jackson-databind</artifactId>
	  <version>2.9.2</version>
	</dependency>
    <dependency>
      <groupId>org.apache.httpcomponents</groupId>
      <artifactId>httpclient</artifactId>
      <version>4.5.2</version>
    </dependency>
  </dependencies>
```

## アニメーション
WebContent/index.htmlを実行してください。  
カーソルキーでの操作のみ対応しています。  
IE11、Chromeで動作確認済みです。  
