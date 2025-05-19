(ns Lista-6.crescente)

(defn checar [[x y]]
  (cond (> x y) "Decrescente"
        (< x y) "Crescente"))

(defn parse [lista]
  (map #(Integer/parseInt %) (clojure.string/split lista #" ")))

(defn main []
  (let [lista (take-while (fn [[x y]] (not= x y)) (repeatedly #(parse (read-line))))]
    (doall (map (fn [x] (println (checar x))) lista))))

(main)