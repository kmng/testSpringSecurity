package todo3

import grails.plugin.springsecurity.annotation.Secured
 
class TodoController {

    @Secured('ROLE_USER')
    def index() { 
	def todos  = Todo.list()
        [todos:todos]

    }
}
