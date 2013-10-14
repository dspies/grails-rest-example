class UrlMappings {

	static mappings = {
        "/$controller/$action?/$id?(.${format})?"{
            constraints {
                // apply constraints here
            }
        }
        "/books"(resources:'book')
        "/reviewers"(resources:'reviewer')
        "/stores"(resources:'store')
        
        "/"(view:"/index")
        "500"(view:'/error')
	}
}
