import mu.KotlinLogging

private val logger = KotlinLogging.logger {}

fun main(args: Array<String>) {

    logger.debug {
        "远程，但合作更紧密！"
    }

    logger.debug {
        "数据科学，高效工具来支持！"
    }

    logger.debug {
        "DevOps, 来了解一下！"
    }

}