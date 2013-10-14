import grails.rest.render.hal.*

beans = {
	halStoreRenderer(HalJsonRenderer, demo.Store)
}
