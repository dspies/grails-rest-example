package demo

class Book {

	String name
	String author

    static constraints = {
    	name blank:false
    	author blank:false
    }
}
