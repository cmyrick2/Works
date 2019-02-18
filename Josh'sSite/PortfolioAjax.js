$(document).ready(function(){
    $.getJSON("Portfolio.json", function(data) {
        $.each(data, function() {
            $.each(this, function(key, value) {
                $("#Ajax").append(
                    "<h3>Title: </h3>" + value.piece_title + "<br><br>" +/*Printing Piece Title*/
                    "<img id='AjaxImg' src ='"+value.image+"'/>" + "<br>" +/*Printing image*/
                    "<h3>Date Made: </h3>" +value.date_made + "<br>" +/*Printing Date Made*/
                    "<h3>Form of Production:</h3> " + value.form_of_production + "<br>" +/*Printing form of production*/
                    "<h3>Piece Description:</h3> <p id='AjaxBorder'>" + value.piece_description + "</p><br><br>"/*Printing piece description*/
                );
            });
        });
    });

});