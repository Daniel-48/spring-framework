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

document.addEventListener('DOMContentLoaded', () => {
	setActiveClass();
	getDate();
	getYear();
});
