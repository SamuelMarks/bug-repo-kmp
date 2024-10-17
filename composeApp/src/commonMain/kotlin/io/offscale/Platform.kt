package io.offscale

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform