package ru.hse.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.context.annotation.Primary
import ru.hse.FooInterface
import ru.hse.RealFoo
import ru.hse.StubFoo

@Configuration
open class AppConfiguration {

    @Bean
    @Primary
    open fun realFoo(): FooInterface = RealFoo("real")

    @Bean
    open fun stubFoo(): FooInterface = StubFoo("stub")
}