function changeConversionType() {
    const conversionType = document.getElementById("conversion-type").value;
    const conversionContents = document.querySelectorAll(".conversion-content");
    conversionContents.forEach(content => content.style.display = "none");

    document.getElementById(`${conversionType}-conversion`).style.display = "block";
}

function convertLength() {
    const value = parseFloat(document.getElementById("length-value").value);
    const from = document.getElementById("length-from").value;
    const to = document.getElementById("length-to").value;
    
    if (isNaN(value)) return alert("Please enter a valid number.");

    let conversionFactors = {
        "millimeters": 1,
        "centimeters": 10,
        "meters": 1000,
        "kilometers": 1000000,
        "inches": 25.4,
        "feet": 304.8,
        "yards": 914.4,
        "miles": 1609344,
        "micrometers": 0.001,
        "nanometers": 0.000001
    };

    let result = value * (conversionFactors[from] / conversionFactors[to]);
    document.getElementById("length-result").innerText = `Result: ${result} ${to}`;
}

function convertWeight() {
    const value = parseFloat(document.getElementById("weight-value").value);
    const from = document.getElementById("weight-from").value;
    const to = document.getElementById("weight-to").value;

    if (isNaN(value)) return alert("Please enter a valid number.");

    let conversionFactors = {
        "milligrams": 1,
        "grams": 1000,
        "kilograms": 1000000,
        "ounces": 28349.5,
        "pounds": 453592,
        "stones": 6350293,
        "metric_tons": 1000000000
    };

    let result = value * (conversionFactors[from] / conversionFactors[to]);
    document.getElementById("weight-result").innerText = `Result: ${result} ${to}`;
}

function convertTemperature() {
    const value = parseFloat(document.getElementById("temperature-value").value);
    const from = document.getElementById("temperature-from").value;
    const to = document.getElementById("temperature-to").value;

    if (isNaN(value)) return alert("Please enter a valid number.");

    let result;
    
    if (from === "C" && to === "F") result = (value * 9 / 5) + 32;
    else if (from === "C" && to === "K") result = value + 273.15;
    else if (from === "F" && to === "C") result = (value - 32) * 5 / 9;
    else if (from === "F" && to === "K") result = (value - 32) * 5 / 9 + 273.15;
    else if (from === "K" && to === "C") result = value - 273.15;
    else if (from === "K" && to === "F") result = (value - 273.15) * 9 / 5 + 32;
    else result = value;

    document.getElementById("temperature-result").innerText = `Result: ${result} ${to}`;
}

function convertVolume() {
    const value = parseFloat(document.getElementById("volume-value").value);
    const from = document.getElementById("volume-from").value;
    const to = document.getElementById("volume-to").value;

    if (isNaN(value)) return alert("Please enter a valid number.");

    let conversionFactors = {
        "milliliters": 1,
        "centiliters": 10,
        "deciliters": 100,
        "liters": 1000,
        "gallons": 3785.41,
        "quarts": 946.353,
        "pints": 473.176,
        "cups": 240,
        "fluid_ounces": 29.5735,
        "cubic_inches": 16.387,
        "cubic_feet": 28316.8,
        "cubic_meters": 1000000
    };

    let result = value * (conversionFactors[from] / conversionFactors[to]);
    document.getElementById("volume-result").innerText = `Result: ${result} ${to}`;
}

function convertArea() {
    const value = parseFloat(document.getElementById("area-value").value);
    const from = document.getElementById("area-from").value;
    const to = document.getElementById("area-to").value;

    if (isNaN(value)) return alert("Please enter a valid number.");

    let conversionFactors = {
        "square_millimeters": 1,
        "square_centimeters": 100,
        "square_meters": 1000000,
        "square_kilometers": 1000000000000,
        "square_inches": 645.16,
        "square_feet": 929.0304,
        "square_yards": 8361.27,
        "square_miles": 25899881104,
        "acres": 4046.86,
        "hectares": 10000
    };

    let result = value * (conversionFactors[from] / conversionFactors[to]);
    document.getElementById("area-result").innerText = `Result: ${result} ${to}`;
}

function convertSpeed() {
    const value = parseFloat(document.getElementById("speed-value").value);
    const from = document.getElementById("speed-from").value;
    const to = document.getElementById("speed-to").value;

    if (isNaN(value)) return alert("Please enter a valid number.");

    let conversionFactors = {
        "meters_per_second": 1,
        "kilometers_per_hour": 3.6,
        "miles_per_hour": 2.23694,
        "knots": 1.94384
    };

    let result = value * (conversionFactors[from] / conversionFactors[to]);
    document.getElementById("speed-result").innerText = `Result: ${result} ${to}`;
}

function convertTime() {
    const value = parseFloat(document.getElementById("time-value").value);
    const from = document.getElementById("time-from").value;
    const to = document.getElementById("time-to").value;

    if (isNaN(value)) return alert("Please enter a valid number.");

    let timeInSeconds;

    switch (from) {
        case "seconds":
            timeInSeconds = value;
            break;
        case "minutes":
            timeInSeconds = value * 60;
            break;
        case "hours":
            timeInSeconds = value * 3600;
            break;
        case "days":
            timeInSeconds = value * 86400;
            break;
        case "weeks":
            timeInSeconds = value * 604800;
            break;
        case "months":
            timeInSeconds = value * 2629746;  // average seconds in a month
            break;
        case "years":
            timeInSeconds = value * 31556952;  // average seconds in a year
            break;
        default:
            timeInSeconds = value;
    }

    let result;
    switch (to) {
        case "seconds":
            result = timeInSeconds;
            break;
        case "minutes":
            result = timeInSeconds / 60;
            break;
        case "hours":
            result = timeInSeconds / 3600;
            break;
        case "days":
            result = timeInSeconds / 86400;
            break;
        case "weeks":
            result = timeInSeconds / 604800;
            break;
        case "months":
            result = timeInSeconds / 2629746;
            break;
        case "years":
            result = timeInSeconds / 31556952;
            break;
        default:
            result = timeInSeconds;
    }

    document.getElementById("time-result").innerText = `Result: ${result} ${to}`;
}

function convertPower() {
    const value = parseFloat(document.getElementById("power-value").value);
    const from = document.getElementById("power-from").value;
    const to = document.getElementById("power-to").value;

    if (isNaN(value)) return alert("Please enter a valid number.");

    let conversionFactors = {
        "watts": 1,
        "kilowatts": 1000,
        "horsepower": 745.7,
        "calories_per_second": 4.184
    };

    let result = value * (conversionFactors[from] / conversionFactors[to]);
    document.getElementById("power-result").innerText = `Result: ${result} ${to}`;
}

function convertEnergy() {
    const value = parseFloat(document.getElementById("energy-value").value);
    const from = document.getElementById("energy-from").value;
    const to = document.getElementById("energy-to").value;

    if (isNaN(value)) return alert("Please enter a valid number.");

    let conversionFactors = {
        "joules": 1,
        "kilojoules": 1000,
        "calories": 4.184,
        "kilocalories": 4184,
        "watt_hours": 3600,
        "kilowatt_hours": 3600000,
        "electron_volts": 1.60218e-19
    };

    let result = value * (conversionFactors[from] / conversionFactors[to]);
    document.getElementById("energy-result").innerText = `Result: ${result} ${to}`;
}

function convertData() {
    const value = parseFloat(document.getElementById("data-value").value);
    const from = document.getElementById("data-from").value;
    const to = document.getElementById("data-to").value;

    if (isNaN(value)) return alert("Please enter a valid number.");

    let conversionFactors = {
        "bytes": 1,
        "kilobytes": 1024,
        "megabytes": 1048576,
        "gigabytes": 1073741824,
        "terabytes": 1099511627776,
        "petabytes": 1125899906842624,
        "exabytes": 1152921504606846976
    };

    let result = value * (conversionFactors[from] / conversionFactors[to]);
    document.getElementById("data-result").innerText = `Result: ${result} ${to}`;
}
