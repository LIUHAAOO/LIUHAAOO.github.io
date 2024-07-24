// scripts.js
document.addEventListener('DOMContentLoaded', () => {
    const carouselInner = document.querySelector('.carousel-inner');
    const slides = document.querySelectorAll('.carousel-inner a');
    let index = 0;

    const updateCarousel = () => {
        index = (index + 1) % slides.length;
        carouselInner.style.transform = `translateX(${-index * 100}%)`;
    };

    setInterval(updateCarousel, 5000); // 每5秒滚动一次
});
