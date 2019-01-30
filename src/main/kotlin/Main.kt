import kotlin.TODO as BlowUp

fun main() {
    registerHandler(handlers = *arrayOf(
        { _ ->
            Unit
        },
        { _ ->
            Unit
            Unit
        })
    )
}

fun registerHandler(vararg handlers: (String) -> Unit) {
    BlowUp()
}