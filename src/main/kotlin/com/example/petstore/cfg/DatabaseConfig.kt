package com.example.petstore.cfg

import com.mongodb.Mongo
import com.mongodb.MongoClient
import org.springframework.context.annotation.Configuration
import org.springframework.data.mongodb.config.AbstractMongoConfiguration
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories
import java.util.*

@Configuration
@EnableMongoRepositories(basePackages = arrayOf("com.example.petstore.api"))
class DatabaseConfig : AbstractMongoConfiguration() {

    override fun mongo(): Mongo = MongoClient("localhost")

    override fun getDatabaseName(): String = "petstore"

    override fun getMappingBasePackages(): MutableCollection<String> = Collections.singleton("com.example.petstore.api")
}