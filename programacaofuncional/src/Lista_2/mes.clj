(ns Lista-2.mes)

(defn mes [n]
  (cond (= n 1) "January"
        (= n 2) "February"
        (= n 3) "March"
        (= n 4) "April"
        (= n 5) "May"
        (= n 6) "June"
        (= n 7) "July"
        (= n 8) "August"
        (= n 9) "September"
        (= n 10) "October"
        (= n 11) "November"
        (= n 12) "December"
        ))

(defn main []
  (let [n (read)]
    (println (mes n))))

(main)