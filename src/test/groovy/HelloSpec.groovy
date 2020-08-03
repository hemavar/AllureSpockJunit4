import io.qameta.allure.Attachment
import io.qameta.allure.Description
import io.qameta.allure.Epic
import io.qameta.allure.Feature
import io.qameta.allure.Flaky
import io.qameta.allure.Owner
import io.qameta.allure.Severity
import io.qameta.allure.SeverityLevel
import io.qameta.allure.Step
import io.qameta.allure.Story
import junit.framework.TestCase
import org.junit.Test
import spock.lang.Specification

@Epic("Epic1")

class HelloSpec extends Specification {

    //def hello = new Hello();

    def setupSpec() {
        println 'Before the first feature method'
    }

    def setup() {
        def Mymsg="Setup started"
    }

    def cleanup() {
        println 'After every feature method'
        addtextAttachment()
    }

    def cleanupSpec() {
        println 'After the last feature method'
    }

    @Description("Hello Test")
    @Severity(SeverityLevel.CRITICAL)
    @Story("Story 1")
    @Step("1")
    @Owner("Hari")
    @Flaky
    def sayHello() {
        given: "A person's name is given as a method parameter."
        //def greeting = hello.sayHello("Hema");

        def greeting = "Hello Hema"
        println("sayHello feature method")
        expect: "Should say hello to the person whose name is given as a method parameter"
        greeting == "Hello Hema";
    }

    @Description("First Test")
    @Severity(SeverityLevel.NORMAL)
    @Story("Story 2")
    @Step("3")
    @Owner("Hema")
    def 'Get message one'() {
        println 'First feature method'
        expect: 'Should return the correct message'
    }

    @Description("Second test")
    @Severity(SeverityLevel.MINOR)
    @Story("Story 3")
    @Step("2")
    @Owner("Hema")
    def 'Get message two'() {
        println 'Second feature method'
        expect: 'Should return the correct message'
    }
    @Attachment
    byte[] addtextAttachment(){
        byte[] message= "Long live and prosper"
        return message
    }
}