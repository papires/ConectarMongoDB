package br.conectar.mongodb;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.ServerAddress;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import com.mongodb.client.MongoIterable;
import com.mongodb.MongoCredential;
import com.mongodb.MongoClientOptions;

import java.util.Arrays;

public class Main {

	public static void main(String[] args) {
		try {
			MongoClient mongoClient = new MongoClient("192.168.0.230", 27017);
			MongoDatabase db = mongoClient.getDatabase("test");

			System.out.println("teste ok.");
/*
			MongoIterable<String> collections = db.listCollectionNames();
			MongoCursor<String> cursor = collections.iterator();
			while (cursor.hasNext()) {
				System.out.println(cursor.next());
			}
*/
			mongoClient.close();
		} catch (Exception e) {
			System.err.println(e.getClass().getName() + ": " + e.getMessage());
		}
	}
}
