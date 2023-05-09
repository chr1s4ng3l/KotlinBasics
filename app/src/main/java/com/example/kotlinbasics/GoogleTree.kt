package com.example.kotlinbasics

class Node(var data: Int, var left: Node? = null, var right: Node? = null)

fun inorderMorrisTraversal(root: Node?) {
    var current = root

    while (current != null) {
        if (current.left == null) {
            print("${current.data} ")
            current = current.right
        } else {
            var temp = current.left
            while (temp?.right != null && temp.right != current) {
                temp = temp.right as? Node // safe cast
            }
            if (temp?.right == null) {
                temp?.right = current
                current = current.left
            } else {
                temp.right = null
                print("${current.data} ")
                current = current.right
            }
        }
    }
}

fun main() {
    val root = Node(1,
        Node(2, Node(4), Node(5)),
        Node(3)
    )
    inorderMorrisTraversal(root)
}