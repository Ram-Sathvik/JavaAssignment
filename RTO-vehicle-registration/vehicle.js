const form = document.getElementById("rtoForm");
const submitBtn = document.getElementById("submitBtn");
const captchaQuestion = document.getElementById("captchaQuestion");
const captchaAnswer = document.getElementById("captchaAnswer");
const toastEl = document.getElementById("successToast");
const formProgress = document.getElementById("formProgress");

const num1 = Math.floor(Math.random() * 10 + 1);
const num2 = Math.floor(Math.random() * 10 + 1);
captchaQuestion.textContent = `${num1} + ${num2} = ?`;

let captchaCorrect = false;

document.getElementById("dob").addEventListener("input", function () {
  const dob = new Date(this.value);
  const today = new Date();
  const age = today.getFullYear() - dob.getFullYear();
  const monthDiff = today.getMonth() - dob.getMonth();
  const dayDiff = today.getDate() - dob.getDate();
  const isOldEnough =
    age > 18 ||
    (age === 18 && (monthDiff > 0 || (monthDiff === 0 && dayDiff >= 0)));
  this.setCustomValidity(isOldEnough ? "" : "You must be at least 18");
  this.classList.toggle("is-valid", isOldEnough);
  this.classList.toggle("is-invalid", !isOldEnough);
  updateSubmitState();
});

captchaAnswer.addEventListener("input", () => {
  captchaCorrect = parseInt(captchaAnswer.value) === num1 + num2;
  captchaAnswer.classList.toggle("is-valid", captchaCorrect);
  captchaAnswer.classList.toggle("is-invalid", !captchaCorrect);
  updateSubmitState();
});

form.addEventListener("input", updateSubmitState);
form.addEventListener("change", updateSubmitState);

function updateSubmitState() {
  const valid =
    form.checkValidity() &&
    document.getElementById("terms").checked &&
    captchaCorrect;
  submitBtn.disabled = !valid;
  updateProgress();
}

function updateProgress() {
  const total = form.querySelectorAll("input, select, textarea").length;
  const validFields = Array.from(form.elements).filter((el) =>
    el.checkValidity()
  ).length;
  const percent = Math.round((validFields / total) * 100);
  formProgress.style.width = percent + "%";
  formProgress.textContent = percent + "%";
}

form.addEventListener("submit", function (e) {
  e.preventDefault();
  if (form.checkValidity() && captchaCorrect) {
    const toast = new bootstrap.Toast(toastEl);
    toast.show();
    form.reset();
    updateSubmitState();
    formProgress.style.width = "0%";
    formProgress.textContent = "0%";
  }
});
