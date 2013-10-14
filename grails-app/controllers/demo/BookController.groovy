package demo

import grails.rest.*

class BookController extends RestfulController {

	static responseFormats = ['json', 'xml']

    public BookController(){
    	super(Book)
    }
}
