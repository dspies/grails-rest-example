package demo



import static org.springframework.http.HttpStatus.*
import grails.transaction.Transactional

@Transactional(readOnly = true)
class ReviewerController {

    static allowedMethods = [save: "POST", update: "PUT", delete: "DELETE"]

    def index(Integer max) {
        params.max = Math.min(max ?: 10, 100)
        respond Reviewer.list(params), model:[reviewerInstanceCount: Reviewer.count()]
    }

    def show(Reviewer reviewerInstance) {
        respond reviewerInstance
    }

    def create() {
        respond new Reviewer(params)
    }

    @Transactional
    def save(Reviewer reviewerInstance) {
        if (reviewerInstance == null) {
            notFound()
            return
        }

        if (reviewerInstance.hasErrors()) {
            respond reviewerInstance.errors, view:'create'
            return
        }

        reviewerInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.created.message', args: [message(code: 'reviewerInstance.label', default: 'Reviewer'), reviewerInstance.id])
                redirect reviewerInstance
            }
            '*' { respond reviewerInstance, [status: CREATED] }
        }
    }

    def edit(Reviewer reviewerInstance) {
        respond reviewerInstance
    }

    @Transactional
    def update(Reviewer reviewerInstance) {
        if (reviewerInstance == null) {
            notFound()
            return
        }

        if (reviewerInstance.hasErrors()) {
            respond reviewerInstance.errors, view:'edit'
            return
        }

        reviewerInstance.save flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.updated.message', args: [message(code: 'Reviewer.label', default: 'Reviewer'), reviewerInstance.id])
                redirect reviewerInstance
            }
            '*'{ respond reviewerInstance, [status: OK] }
        }
    }

    @Transactional
    def delete(Reviewer reviewerInstance) {

        if (reviewerInstance == null) {
            notFound()
            return
        }

        reviewerInstance.delete flush:true

        request.withFormat {
            form {
                flash.message = message(code: 'default.deleted.message', args: [message(code: 'Reviewer.label', default: 'Reviewer'), reviewerInstance.id])
                redirect action:"index", method:"GET"
            }
            '*'{ render status: NO_CONTENT }
        }
    }

    protected void notFound() {
        request.withFormat {
            form {
                flash.message = message(code: 'default.not.found.message', args: [message(code: 'reviewerInstance.label', default: 'Reviewer'), params.id])
                redirect action: "index", method: "GET"
            }
            '*'{ render status: NOT_FOUND }
        }
    }
}
