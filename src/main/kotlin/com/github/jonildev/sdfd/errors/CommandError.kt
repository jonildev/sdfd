package com.github.jonildev.sdfd.errors

class CommandError(message: String, cause: Throwable) : Error(message, cause)