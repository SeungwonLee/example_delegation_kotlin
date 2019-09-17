package com.example.delegation

class MySetMap : Set<Long> by HashSet(), Map<Long, Long> by HashMap() {
    override val size: Int
        get() = TODO("not implemented")

    override fun isEmpty(): Boolean {
        TODO("not implemented")
    }
}
