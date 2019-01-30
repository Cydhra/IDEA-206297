fun main() {
    registerHandler(*arrayOf(
        { _ ->
            Unit
        },
        { _ ->
            Unit
        })
    )

    // in case of named arguments, the arrayOf syntax is required
    registerHandler(handlers = *arrayOf(
        { _ ->

        },
        { _ ->

        })
    )
}

fun registerHandler(vararg handlers: (String) -> Unit) {
    handlers.forEach { it.invoke("hello") }
}