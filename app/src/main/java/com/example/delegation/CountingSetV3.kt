package com.example.delegation

import java.util.*

class CountingSetV3(
    private val delegate: MutableList<Long> = LinkedList()
) : MutableList<Long> by LinkedList() {

    private var addCount = 0L

    override fun add(element: Long): Boolean {
        addCount++
        return delegate.add(element)
    }

    override fun addAll(elements: Collection<Long>): Boolean {
        addCount += elements.size
        return delegate.addAll(elements)
    }
}
