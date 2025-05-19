(ns Lista-4.resto2)

(defn resto[x]
  (filter (fn [y] (= (mod y x) 2)) (range 1 10001)))

(defn main []
  (let [n (read)]
    (doall (map println (resto n)))))

(main)