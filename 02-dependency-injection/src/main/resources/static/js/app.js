// Add active class dynamically to navbar
function setActiveClass() {
	const activePage = window.location.pathname;
	const navLinks = document.querySelectorAll('.navbar-nav a')
	navLinks.forEach(link => {
		if (link.href.includes(`${activePage}`)) {
			link.classList.add('active');
		}
	});
}

// Get current date
function getDate() {
	moment.locale('es');
	let date = new Date();
	date = moment(date).format('dddd, D MMMM YYYY')
	document.querySelector('.date').innerHTML = date;
}

// Get current year
function getYear() {
	const year = new Date().getFullYear();
	document.querySelector('#year').innerHTML = year;
}

// Calculate the total sum of all products
function calculateTotalSum() {
	let total = 0;
	const elements = document.querySelectorAll(".elements");
	const result = document.querySelector("#result")
	elements.forEach(e => {
		total += parseFloat(e.textContent.replaceAll('.', '').replace(',', '.'));
	});
	result.textContent = new Intl.NumberFormat('es-ES', { style: 'currency', currency: 'EUR' }).format(total);
}

document.addEventListener('DOMContentLoaded', () => {
	setActiveClass();
	getDate();
	getYear();
	calculateTotalSum();
});
