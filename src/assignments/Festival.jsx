import { useState, useEffect } from "react";

const Festival = () => {
  const [festival, setFestival] = useState("Diwali");
  const [countdown, setCountdown] = useState(10);

  // Run on every render
  useEffect(() => {
    console.log("Festival App Rendered");
  });

  // Run only once (Welcome alert)
  useEffect(() => {
    alert("Welcome to Festival App!");
  }, []);

  // Run whenever festival changes
  useEffect(() => {
    console.log(`Festival changed to ${festival}`);
  }, [festival]);

  // Countdown timer with cleanup
  useEffect(() => {
    const timer = setInterval(() => {
      setCountdown((prev) => (prev > 0 ? prev - 1 : 0));
    }, 1000);

    return () => {
      clearInterval(timer);
      console.log("Timer cleared on unmount");
    };
  }, []);

  // Run when festival OR countdown changes
  useEffect(() => {
    console.log(`Festival: ${festival}, Countdown: ${countdown}`);
  }, [festival, countdown]);

  return (
    <div className="container text-center mt-5">
      <h2>Festival App with useEffect</h2>
      <p>Festival: {festival}</p>
      <p>Countdown: {countdown}</p>

      <div className="mt-3">
        <button className="btn btn-dark me-2" onClick={() => setFestival("Holi")} >Change to Holi</button>
        <button className="btn btn-dark me-2" onClick={() => setFestival("Pongal")} >Change to Pongal</button>
        <button className="btn btn-dark" onClick={() => setCountdown(countdown - 1)} >Decrease Countdown</button>
      </div>
    </div>
  );
};

export default Festival;