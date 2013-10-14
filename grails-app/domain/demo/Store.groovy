package demo

class Store {

	String name
	String location

    static constraints = {
    	name blank:false
    	location blank:false
    }
}
