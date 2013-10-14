import demo.*

class BootStrap {

    def init = { servletContext ->
    	new Publisher(name:'Publisher 1', location:'Tucson, AZ').save()
    	new Publisher(name:'Publisher 2', location:'New York, NY').save()
    	assert Publisher.count() == 2

    	new Book(name:'Book 1', author:'author 1').save()
    	new Book(name:'Book 2', author:'author 2').save()
    	assert Book.count() == 2

    	new Reviewer(name:'Reviewer 1', description:'Reviewer for the xyz co.').save()
    	new Reviewer(name:'Reviewer 2', description:'Reviewer for the abc co.').save()
    	assert Reviewer.count() == 2

        new Store(name:'Store 1', location:'Tucson, AZ').save()
        new Store(name:'Store 2', location:'Los Angeles, CA').save()
        assert Store.count() == 2
    }
    def destroy = {
    }
}
