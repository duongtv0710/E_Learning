function loadRoleData() {
    // LẤY TOKEN TỪ LOCALSTORAGE
    let token = localStorage.getItem('USER_TOKEN');

    axios({
        url: 'http://localhost:8080/api/admin/role',
        method: 'get',
        headers: {
            "Authorization": `Bearer ${token}`
        }
    })
    .then(function(resp) {
        let listRole = resp.data;
        let content = '';
        for (let role of listRole) {
            content += `
            <tr>
                <th>${role.id}</th>
                <td>${role.name}</td>
                <td>${role.description}</td>
                <td>
                    <a href="#"
                        class="btn btn-sm btn-info btn-round py-1 font-weight-bold">Sửa</a>
                    <a href="#"
                        class="btn btn-sm btn-danger btn-round py-1 font-weight-bold">Xóa</a>
                </td>
            </tr>
            `;
        }
        document.getElementById('tbodyRole').innerHTML = content;
    })
    .catch(function(err){
        let data = err.response.data;
        if(data.status == 401){
            alert('Chưa đăng nhập!')
        }
        else if(data.status == 403){
            alert('Không có quyền truy cập!')
        }
    })
}

loadRoleData();