//package com.bigdata.kafka.db;
//
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoCollection;
//import com.mongodb.client.MongoDatabase;
//import org.bson.Document;
//
//public class DbAccess {
//  public static void main(String[] args) {
//	  
//    // MongoDB Atlas bağlantı bilgilerini kullanarak bir MongoClient oluşturun
//    MongoClient mongoClient = MongoClients.create("${mongodb.connectionstring}"
//        );
//
//    // Veritabanı ve birincil anahtar olarak kullanılacak koleksiyonu seçin
//    MongoDatabase database = mongoClient.getDatabase("mydatabase");
//    MongoCollection<Document> collection = database.getCollection("mycollection");
//
//    // Yeni bir Document nesnesi oluşturun ve verileri doldurun
//    Document document = new Document("name", "John")
//                         .append("age", 30)
//                         .append("profession", "Developer");
//
//    // Koleksiyonda yeni bir kayıt ekleyin
//    collection.insertOne(document);
//
//    // Bağlantıyı kapatın
//    mongoClient.close();
//  }
//}
//
//
//
//
//
////	ConnectionString connectionString = new ConnectionString("mongodb+srv://bigdatakafka:<password>@cluster0.kddkau8.mongodb.net/?retryWrites=true&w=majority");
////	MongoClientSettings settings = MongoClientSettings.builder()
////	        .applyConnectionString(connectionString)
////	        .serverApi(ServerApi.builder()
////	            .version(ServerApiVersion.V1)
////	            .build())
////	        .build();
////	MongoClient mongoClient = MongoClients.create(settings);
////	MongoDatabase database = mongoClient.getDatabase("test");
//
