package demo

class Reviewer {

	String name
	String description

    static constraints = {
    	name blank:false
    	description blank:true, maxSize:255
    }
}
