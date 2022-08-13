import $ from "jQuery";

$(document).ready(function () {
  $("#txt").val("Nissan GTR");
});

$("#txt").on("focusin", function () {
  console.log("Saving value " + $(this).val());
  $(this).data("val", $(this).val());
});

$("#txt").on("change", function () {
  var prev = $(this).data("val");
  var current = $(this).val();
  console.log("Prev value " + prev);
  console.log("New value " + current);
});

$("#btn").on("click", function () {
  console.log("The Final value is : " + $("#txt").val());
});
