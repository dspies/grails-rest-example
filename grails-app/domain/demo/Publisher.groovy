package demo

import grails.rest.*


@Resource(uri="/publishers", formats=['json', 'xml'])
class Publisher {

	String name
	String location

    static constraints = {
    	name blank:false
    	location blank:false, maxSize: 35
    }
}
