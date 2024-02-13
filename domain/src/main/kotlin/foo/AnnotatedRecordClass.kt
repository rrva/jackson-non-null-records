package foo

import com.fasterxml.jackson.annotation.JsonInclude

@JvmRecord
data class AnnotatedRecordClass (
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val omitFieldIfNull: String?,
    val standardField: String?
)