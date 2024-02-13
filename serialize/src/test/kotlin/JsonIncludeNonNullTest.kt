import createObjectMapper
import foo.AnnotatedRecordClass
import foo.AnnotatedStandardClass
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals


class JsonIncludeNonNullTest {

    @Test
    fun `omits null fields of jvm record classes if annotated as such`() {
        val objectMapper = createObjectMapper()
        val o  = AnnotatedRecordClass(null, null)
        val json = objectMapper.writeValueAsString(o)
        assertEquals("""{"standardField":null}""", json)
    }

    @Test
    fun `omits null fields of kotlin data classes if annotated as such`() {
        val objectMapper = createObjectMapper()
        val o  = AnnotatedStandardClass(null, null)
        val json = objectMapper.writeValueAsString(o)
        assertEquals("""{"standardField":null}""", json)
    }

}