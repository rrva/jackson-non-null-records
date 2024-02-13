package foo

import com.fasterxml.jackson.annotation.JsonInclude


data class AnnotatedStandardClass (
    @JsonInclude(JsonInclude.Include.NON_NULL)
    val omitFieldIfNull: String?,
    val standardField: String?
)