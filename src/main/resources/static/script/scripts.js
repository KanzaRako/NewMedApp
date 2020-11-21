var search_input = document.querySelector("#searchInput");

search_input.addEventListener("keyup", function(e){
    var span_items = document.querySelectorAll(".table_body .specialite span");
    var table_body = document.querySelector(".table_body ul");
    var search_item = e.target.value.toLowerCase();
    console.log("search item : " + search_item);
    span_items.forEach(function(item){
        if(item.textContent.toLowerCase().indexOf(search_item) != -1){
            item.closest("li").style.display = "block";
        }
        else{
            item.closest("li").style.display = "none";
        }
    })

});

