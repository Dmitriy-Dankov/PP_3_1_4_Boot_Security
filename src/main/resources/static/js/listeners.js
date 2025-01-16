
if (document.location.pathname == '/admin') {
    const $textTab = document.getElementById('txt_tab_user')

    const $userTab = document.getElementById('user-tab')
    $userTab.addEventListener("click", function() { $textTab.textContent = "All users" })

    const $newUserTab = document.getElementById('new_user-tab')
    $newUserTab.addEventListener("click", function() { $textTab.textContent = "Add new user" })

    const $xClose = document.querySelector('.btn-close')
    const $btnClose = document.querySelector('.my_close')
    const resetEdit = document.forms[2].querySelector('#clear_edit')
    $xClose.addEventListener("click", function() { resetEdit.click() })
    $btnClose.addEventListener("click", function() { resetEdit.click() })
}

export {
};