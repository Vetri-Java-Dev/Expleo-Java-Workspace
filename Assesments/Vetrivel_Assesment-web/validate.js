document.getElementById("regForm").addEventListener("submit", function (e) {
    e.preventDefault();
    let isValid = true;

    const fullname = document.getElementById("fullname");
    const errFullname = document.getElementById("err-fullname");

    if (fullname.value.trim() === "") {
        showError(fullname, errFullname, "Full Name must not be empty.");
        isValid = false;
    } else {
        clearError(fullname, errFullname);
    }

    const email = document.getElementById("email");
    const errEmail = document.getElementById("err-email");
    const emailVal = email.value.trim();

    if (!emailVal.includes("@") || !emailVal.endsWith(".com")) {
        showError(email, errEmail, "Email must contain '@' and end with '.com'.");
        isValid = false;
    } else {
        clearError(email, errEmail);
    }

    const dob = document.getElementById("dob");
    const errDob = document.getElementById("err-dob");

    if (dob.value === "") {
        showError(dob, errDob, "Date of Birth is required.");
        isValid = false;
    } else {
        const today = new Date();
        const birthDate = new Date(dob.value);

        let age = today.getFullYear() - birthDate.getFullYear();
        const monthDiff = today.getMonth() - birthDate.getMonth();

        if (monthDiff < 0 || (monthDiff === 0 && today.getDate() < birthDate.getDate())) {
            age--;
        }

        if (age < 17) {
            showError(dob, errDob, "Student must be at least 17 years old.");
            isValid = false;
        } else {
            clearError(dob, errDob);
        }
    }

    const course = document.getElementById("course");
    const errCourse = document.getElementById("err-course");

    if (course.value === "" || course.value === null) {
        showError(course, errCourse, "Please select a course.");
        isValid = false;
    } else {
        clearError(course, errCourse);
    }

    
    if (isValid) {
        alert("Form submitted successfully! Welcome aboard.");
        // In a real app, replace the alert with: this.submit();
    }
});


function showError(field, errSpan, message) {
    field.classList.add("invalid");
    errSpan.textContent = message;
}

function clearError(field, errSpan) {
    field.classList.remove("invalid");
    errSpan.textContent = "";
}
