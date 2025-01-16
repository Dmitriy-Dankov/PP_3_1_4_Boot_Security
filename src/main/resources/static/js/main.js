import * as service from './user_service.js';
import * as listen from './listeners.js';

if (document.location.pathname == '/admin') {
    service.getUsers()

    const $regForm = document.forms[1]
    const $editForm = document.forms[2]
    const $deleteForm = document.forms[3]

    function submitListeners() {
        $regForm.addEventListener("submit", function (event) {
            event.preventDefault()
            service.addUser($regForm)
            $regForm.querySelector('#clear').click()
        })
        $editForm.addEventListener("submit", function (event) {
            event.preventDefault()
            service.editUser($editForm)
        })
        $deleteForm.addEventListener("submit", function (event) {
            event.preventDefault()
            service.deleteUser($deleteForm)
        })
    }
    
    submitListeners()

} else {
    if (!document.getElementById('roles').innerText.includes("ADMIN")) {
        const $linkUser = document.getElementById('link_user')

        document.getElementById('link_admin').style.display = 'none';
        $linkUser.parentNode.classList.add("block_blue");
        $linkUser.style.color = 'white';
    }
}