package de.scai.jrebelgormrecompilebug.model.entity

import grails.gorm.annotation.Entity
import org.grails.datastore.gorm.GormEntity

@Entity
class Person implements GormEntity<Person> {
    String firstName
    String lastName
    static constraints = {
        firstName blank:false
        lastName blank:false
    }
}
