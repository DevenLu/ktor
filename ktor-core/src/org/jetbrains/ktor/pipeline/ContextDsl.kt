package org.jetbrains.ktor.pipeline

@DslMarker
@Target(*arrayOf(AnnotationTarget.CLASS, AnnotationTarget.TYPEALIAS, AnnotationTarget.TYPE))
annotation class ContextDsl