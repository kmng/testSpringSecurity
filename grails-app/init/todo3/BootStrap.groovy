package todo3

class BootStrap {

    def springSecurityService

    def init = { servletContext ->
           5.times { new Todo(description: "Todo ${it+1}").save() }

           def userRole = new Role('ROLE_USER').save flush:true
 
        def me = new User('user', springSecurityService.encodePassword('admin')).save flush:true
 
        UserRole.create me, userRole
 
        UserRole.withSession {
            it.flush()
            it.clear()
        }

    }
    def destroy = {
    }
}
