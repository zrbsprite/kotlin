package test.template

import kotlin.template.experiment3.*
import kotlin.test.assertEquals

import junit.framework.TestCase

class StringTemplateTest : TestCase() {
    fun testTemplate(): Unit {
        val name = "James"

        // Code generated by the following template expression:
        //
        // val actual = "hello $name!"
        val builder = StringTemplate(array("hello ", "!")).builder()
        builder.expression(name)
        val actual = builder.build()

        assertEquals("hello James!", actual)
    }
}